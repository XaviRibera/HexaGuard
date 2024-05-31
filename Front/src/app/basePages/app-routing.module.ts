import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RecordRoutingModule } from './record/record-routing.module';
import { LabelModule } from './label/label.module';

const routes: Routes = [
  { path: '', redirectTo: 'records', pathMatch: 'full' },
  { path: 'records', loadChildren: () => import('./record/record.module').then((m) => m.RecordModule) },
  { path: 'labels', loadChildren: () => import('./label/label.module').then((m) => m.LabelModule)},
  { path: '**', redirectTo: 'records', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes), RecordRoutingModule, LabelModule],
  exports: [RouterModule]
})
export class AppRoutingModule { }
