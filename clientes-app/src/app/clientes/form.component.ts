import { Component } from '@angular/core';
import { Cliente } from './cliente';
import { ClienteService } from './cliente.service';
import { Router, ActivatedRoute } from '@angular/router';
import swal from 'sweetalert2';
import { Region } from './detalle/region';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
})
export class FormComponent {
  public cliente: Cliente = new Cliente();
  public regiones: Region[];
  public titulo: string = 'Crear Cliente';
  public errores: string[];

  constructor(
    private clienteService: ClienteService,
    private router: Router,
    private activateRoute: ActivatedRoute
  ) {}

  ngOnInit(): void {
    this.cargarCliente();

    this.clienteService
      .getRegiones()
      .subscribe((regiones) => (this.regiones = regiones));
  }

  cargarCliente(): void {
    this.activateRoute.params.subscribe((params) => {
      let id = params['id'];
      if (id) {
        this.clienteService
          .getCliente(id)
          .subscribe((cliente) => (this.cliente = cliente));
      }
    });
  }

  create(): void {
    console.log(this.cliente)
    this.clienteService.create(this.cliente).subscribe({
      next: (cliente) => {
        this.router.navigate(['/clientes']);
        swal(
          'Nuevo Cliente',
          `El cliente ${cliente.nombre} ha sido creado con éxito`,
          'success'
        );
      },
      error: (err) => {
        this.errores = err.error.errors as string[];
        console.error('Codigo del error desde el backend: ' + err.status);
        console.error(err.error.errors);
      },
    });
  }

  update(): void {
    console.log(this.cliente)
    this.cliente.facturas = null;
    this.clienteService.update(this.cliente).subscribe({
      next: (json) => {
        this.router.navigate(['/clientes']);
        swal(
          'Cliente Actualizado',
          `${json.mensaje}: ${json.cliente.nombre}`,
          'success'
        );
      },
      error: (err) => {
        this.errores = err.error.errors as string[];
        console.error('Codigo del error desde el backend: ' + err.status);
        console.error(err.error.errors);
      },
    });
  }

  compararRegion(o1: Region, o2: Region):boolean {
    if(o1 === undefined && o2 === undefined){
      return true
    }
    return o1 === null || o2 === null || o1 === undefined || o2 === undefined ? false : o1.id === o2.id;
  }
}
