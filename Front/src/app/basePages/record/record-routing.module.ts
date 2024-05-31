import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListRecordPageComponent } from './list-record-page/list-record-page.component';
import { RecordFormComponent } from './record-form/record-form.component';

const routes: Routes = [
  {path: '', component: ListRecordPageComponent},
  { path: 'form', component: RecordFormComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class RecordRoutingModule { }
