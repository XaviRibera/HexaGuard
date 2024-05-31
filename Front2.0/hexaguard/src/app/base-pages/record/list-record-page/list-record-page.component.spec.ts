import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListRecordPageComponent } from './list-record-page.component';

describe('ListRecordPageComponent', () => {
  let component: ListRecordPageComponent;
  let fixture: ComponentFixture<ListRecordPageComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ListRecordPageComponent]
    });
    fixture = TestBed.createComponent(ListRecordPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
