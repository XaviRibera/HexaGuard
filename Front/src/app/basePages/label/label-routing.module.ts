import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LabelFormComponent } from './label-form/label-form.component';

const routes: Routes = [
  { path: '', component: LabelFormComponent }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class LabelRoutingModule { }
