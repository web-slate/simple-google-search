import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AppGoogleFooterComponent } from './app-google-footer.component';

describe('AppGoogleFooterComponent', () => {
  let component: AppGoogleFooterComponent;
  let fixture: ComponentFixture<AppGoogleFooterComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AppGoogleFooterComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AppGoogleFooterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
