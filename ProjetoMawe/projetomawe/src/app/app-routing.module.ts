import { SobreNosComponent } from './sobre-nos/sobre-nos.component';
import { ContatoComponent } from './contato/contato.component';
import { HomeComponent } from './home/home.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LogarComponent } from './logar/logar.component';
import { CadastrarComponent } from './cadastrar/cadastrar.component';
import { InicioComponent } from './inicio/inicio.component';
import { ProdutoComponent } from './produto/produto.component';

const routes: Routes = [
  {path:'', redirectTo: 'home', pathMatch: 'full'},
  {path:"home", component: HomeComponent },
  {path:"contato", component:ContatoComponent },
  {path:"sobre-nos", component:SobreNosComponent },
  {path: "Logar" , component: LogarComponent},
  {path: "Cadastrar", component: CadastrarComponent},
  {path: "Inicio", component: InicioComponent},
  {path: "Produto", component: ProdutoComponent}


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
