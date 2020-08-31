import { TestBed } from '@angular/core/testing';

import { CarteezzFormService } from './carteezz-form.service';

describe('CarteezzFormService', () => {
  let service: CarteezzFormService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CarteezzFormService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
