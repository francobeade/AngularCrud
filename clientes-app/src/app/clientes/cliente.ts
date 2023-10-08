import { Factura } from "../facturas/models/factura";
import { Region } from "./detalle/region";

export class Cliente {
    id: number;
    nombre: string;
    apellido: string;
    createAt: string;
    email: string;
    image: string;
    region:Region;
    facturas: Factura[] = [];
}
