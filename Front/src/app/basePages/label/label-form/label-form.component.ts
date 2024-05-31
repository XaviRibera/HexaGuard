import { Component } from '@angular/core';
import {
  AbstractControl,
  FormBuilder,
  FormGroup,
  ValidationErrors,
  Validators,
} from '@angular/forms';
import { Router } from '@angular/router';
import { Subscription } from 'rxjs';
import { LabelService } from 'src/app/services/label/label.service';

@Component({
  selector: 'app-label-form',
  templateUrl: './label-form.component.html',
  styleUrls: ['./label-form.component.scss']
})
export class LabelFormComponent {
  formValue: any;
  succesSend = false;

  newLabelForm: FormGroup = this.formBuilder.group({
    name: [null, [Validators.required, Validators.minLength(3), Validators.maxLength(30)]],
    colorCode: ['#000000'],
    description: [null, [Validators.maxLength(300)]]
  })

  private labelServiceSubscription: Subscription | null = null;

  constructor(
    private formBuilder: FormBuilder,
    private router: Router,
    private labelService: LabelService
  ) { }

  sendNewLabelInfo() {
    if(this.newLabelForm.invalid) return;
    this.formValue = this.newLabelForm.value;
    this.submitLabel()
    this.succesPost();
  }

  private succesPost() {
    this.succesSend = true;
  }

  private submitLabel() {
    this.labelService.insertLabel(this.formValue)
    console.log(this.formValue)
  }

  ngOnDestroy() {
    this.labelServiceSubscription?.unsubscribe();
  }
}
