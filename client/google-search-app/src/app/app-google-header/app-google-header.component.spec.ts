import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AppGoogleHeaderComponent } from './app-google-header.component';

describe('AppGoogleHeaderComponent', () => {
  let component: AppGoogleHeaderComponent;
  let fixture: ComponentFixture<AppGoogleHeaderComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AppGoogleHeaderComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AppGoogleHeaderComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
