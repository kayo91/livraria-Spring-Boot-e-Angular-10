import { Router } from '@angular/router';
import { Categoria } from './../categoria.model';
import { CategoriaService } from './../categoria.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-categoria-create',
  templateUrl: './categoria-create.component.html',
  styleUrls: ['./categoria-create.component.css']
})
export class CategoriaCreateComponent implements OnInit {

  categoria:Categoria = {
    name: '',
    descricao: ''
  }

  constructor(private service: CategoriaService, private router:Router) { }

  ngOnInit(): void {
  }

  create(): void {
    this.service.create(this.categoria).subscribe((resposta) => {
      this.service.mensagem('Categoria criada com sucesso!')
      this.router.navigate(['categorias'])
    }, err => { // err simboliza o erro
      for(let i = 0; i < err.error.errors.lenght; i++) {
        this.service.mensagem(err.error.errors[i].menssage)
      } 
      // falta arrumar o metodo para retornar a mensagem de erro da api
      // this.service.mensagem(err.error.errors.menssage)
    })
  }

  cancel():void {
    this.router.navigate(['categorias'])
  }

}
