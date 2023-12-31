
import { Component } from '@angular/core';
import { AuthService } from '../usuarios/auth.service';
import { Router } from '@angular/router';
import swal from 'sweetalert2';


@Component({
    selector: 'app-header',
    templateUrl: './header.component.html'
})

export class HeaderComponent {

    constructor(public authService:AuthService, private router:  Router){}

    logout():void {
        swal('Logout', `Hola ${this.authService.usuario.username}, has cerrado sesión con éxito`, 'success');
        this.authService.logout();
        this.router.navigate(['/login']);
    }
}