import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RecordRoutingModule } from './record/record-routing.module';

const routes: Routes = [
  { path: '', redirectTo: 'records', pathMatch: 'full' },
  { path: 'records', loadChildren: () => import('./record/record-routing.module').then((m) => m.RecordRoutingModule) },
];

@NgModule({
  imports: [RouterModule.forRoot(routes), RecordRoutingModule],
  exports: [RouterModule]
})
export class AppRoutingModule { }
