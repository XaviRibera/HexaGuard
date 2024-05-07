import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListRecordComponent } from './list-record/list-record.component';

const routes: Routes = [
  {path: '', component: ListRecordComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class RecordRoutingModule { }
