import { Injectable } from '@angular/core';
import { Cliente } from './cliente';
import { of, Observable, throwError } from 'rxjs';
import { HttpClient, HttpEvent, HttpRequest } from '@angular/common/http';
import { map, catchError, tap } from 'rxjs';
import swal from 'sweetalert2';
import { Router } from '@angular/router';
import { formatDate, registerLocaleData } from '@angular/common';
import { Region } from './detalle/region';
//import { AuthService } from '../usuarios/auth.service';

@Injectable({
  providedIn: 'root',
})
export class ClienteService {
  private urlEndPoint: string = 'http://localhost:8080/api/clientes';
  //Todo lo relacionado al header se reemplazo por TokenInterceptor
  //private httpHeaders = new HttpHeaders({ 'Content-Type': 'application/json' });

  constructor(
    private http: HttpClient,
    private router: Router
  ) //private authService: AuthService
  {}

  // REEMPLAZADO POR TOKEN.INTERCEPTOR
  // private agregarAuthorizationHeader() {
  //   let token = this.authService.token;
  //   if (token != null) {
  //     return this.httpHeaders.append('Authorization', 'Bearer ' + token);
  //   }
  //   return this.httpHeaders;
  // }

  //REEMPLAZADO POR AuthInterceptor
  // private isNoAutorizado(e): boolean {
  //   if (e.status == 401) {
  //     if (this.authService.isAuthenticated()) {
  //       this.authService.logout();
  //     }
  //     this.router.navigate(['/login']);
  //     return true;
  //   }

  //   if (e.status == 403) {
  //     swal(
  //       'Acceso denegado',
  //       `Hola ${this.authService.usuario.username} no tienes acceso a este recurso!`,
  //       'warning'
  //     );
  //     this.router.navigate(['/clientes']);
  //     return true;
  //   }
  //   return false;
  // }

  getRegiones(): Observable<Region[]> {
    return this.http.get<Region[]>(this.urlEndPoint + '/regiones', {
      //headers: this.agregarAuthorizationHeader(),
    });
    // AuthInterceptor
    // .pipe(
    //   catchError((e) => {
    //     this.isNoAutorizado(e);
    //     return throwError(e);
    //   })
    // );
  }

  getClientes(page: number): Observable<any> {
    return this.http.get(this.urlEndPoint + '/page/' + page).pipe(
      tap((response: any) => {
        // console.log('ClienteService: tap 1');
        (response.content as Cliente[]).forEach((cliente) => {
          // console.log(cliente.nombre);
        });
      }),
      map((response: any) => {
        (response.content as Cliente[]).map((cliente) => {
          cliente.nombre = cliente.nombre.toUpperCase();
          // cliente.createAt = formatDate(cliente.createAt, 'EEEE dd-MMMM-yyyy', 'es-AR');
          return cliente;
        });
        return response;
      }),
      tap((response) => {
        // console.log('ClienteService: tap 2');
        (response.content as Cliente[]).forEach((cliente) => {
          // console.log(cliente.nombre);
        });
      })
    );
  }

  create(cliente: Cliente): Observable<Cliente> {
    return this.http
      .post(this.urlEndPoint, cliente, {
        //headers: this.agregarAuthorizationHeader(),
      })
      .pipe(
        map((response: any) => response.cliente as Cliente),
        catchError((e) => {
          //AuthInterceptor
          // if (this.isNoAutorizado(e)) {
          //   return throwError(e);
          // }

          if (e.status == 400) {
            return throwError(e);
          }

          if(e.error.mensaje){
            console.error(e.error.mensaje);
          }
          //swal(e.error.mensaje, e.error.error, 'error');
          return throwError(e);
        })
      );
  }

  getCliente(id): Observable<Cliente> {
    return this.http
      .get<Cliente>(`${this.urlEndPoint}/${id}`, {
        //headers: this.agregarAuthorizationHeader(),
      })
      .pipe(
        catchError((e) => {
          //AuthInterceptor
          // if (this.isNoAutorizado(e)) {
          //   return throwError(e);
          // }
          if(e.status != 401 && e.error.mensaje){
          this.router.navigate(['/clientes']);
          console.error(e.error.mensaje);
        }
          //swal('Error al editar', e.error.mensaje, 'error');
          return throwError(e);
        })
      );
  }

  update(cliente: Cliente): Observable<any> {
    return this.http
      .put<any>(`${this.urlEndPoint}/${cliente.id}`, cliente, {
        //headers: this.agregarAuthorizationHeader(),
      })
      .pipe(
        catchError((e) => {
          //AuthInterceptor
          // if (this.isNoAutorizado(e)) {
          //   return throwError(e);
          // }

          if (e.status == 400) {
            return throwError(e);
          }

          if(e.error.mensaje){
            console.error(e.error.mensaje);
          }
          swal(e.error.mensaje, e.error.error, 'error');
          return throwError(e);
        })
      );
  }

  delete(id: number): Observable<Cliente> {
    return this.http
      .delete<Cliente>(`${this.urlEndPoint}/${id}`, {
        //headers: this.agregarAuthorizationHeader(),
      })
      .pipe(
        catchError((e) => {
          //AuthInterceptor
          // if (this.isNoAutorizado(e)) {
          //   return throwError(e);
          // }

          if(e.error.mensaje){
            console.error(e.error.mensaje);
          }
          swal(e.error.mensaje, e.error.error, 'error');
          return throwError(e);
        })
      );
  }

  subirFoto(archivo: File, id): Observable<HttpEvent<{}>> {
    let formData = new FormData();
    formData.append('archivo', archivo);
    formData.append('id', id);

    // REEMPLAZADO POR TOKEN.INTERCEPTOR
    // let httpHeaders = new HttpHeaders();
    // let token = this.authService.token;
    // if (token != null) {
    //   httpHeaders = httpHeaders.append('Authorization', 'Bearer ' + token);
    // }

    const req = new HttpRequest(
      'POST',
      `${this.urlEndPoint}/upload`,
      formData,
      {
        reportProgress: true,
        //  headers: httpHeaders,
      }
    );
    return this.http.request(req);
    //AuthInterceptor
    // .pipe(
    //   catchError((e) => {
    //     this.isNoAutorizado(e);
    //     return throwError(e);
    //   })
    // );
  }
}
