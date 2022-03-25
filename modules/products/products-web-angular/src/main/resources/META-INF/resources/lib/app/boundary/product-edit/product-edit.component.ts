import { Component, EventEmitter, Input, Output } from '@angular/core';
import { Router } from "@angular/router";
import { FormControl, FormGroup, Validators } from "@angular/forms";

import { Product } from "../../entity/product";
import { config } from "../../config";

@Component({
	selector: 'app-product-edit-ui',
	template: `
		
		<form [formGroup]="updateForm" (ngSubmit)="onSubmit()">
			
			<div class="sheet sheet-lg">
				
				<!-- form header -->
				<div class="sheet-header">
					<h2 class="sheet-title">{{Liferay.Language.get('edit-product')}}</h2>
					<div class="sheet-text">
					</div>
				</div>
				
				<div class="sheet-section">
					
					<!-- category field -->
					<div class="form-group">
						
						<label for="_category">
							{{Liferay.Language.get('category')}}
							<span class="reference-mark text-warning">
								<svg 
									aria-hidden="true" 
									class="lexicon-icon lexicon-icon-asterisk" 
									focusable="false"
								>
									<use [attr.href]="iconsURL + '#asterisk'"></use>
								</svg>
							</span>
						</label>
						
						<select
							id="_category"
							formControlName="category" 
							class="form-control"
						>
							<option value="Electronics">{{Liferay.Language.get('electronics')}}</option>
							<option value="Sporting Goods">{{Liferay.Language.get('sporting-goods')}}</option>
						</select>
						
					</div>
					
					<!-- name field -->
					<div class="form-group">
						
						<label for="_name">
							{{Liferay.Language.get('name')}}
							<span class="reference-mark text-warning">
								
								<svg 
									aria-hidden="true" 
									class="lexicon-icon lexicon-icon-asterisk" 
									focusable="false"
								>
									<use [attr.href]="iconsURL + '#asterisk'"></use>
								</svg>
								
							</span>
						</label>
						<input
							id="_name"
							formControlName="name"
							class="form-control"
							type="text"
						/>
					</div>
					
					<!-- price -->
					<div class="form-group">
						
						<label for="_price">
							{{Liferay.Language.get('price')}}
							<span class="reference-mark text-warning">
								
								<svg 
									aria-hidden="true" 
									class="lexicon-icon lexicon-icon-asterisk" 
									focusable="false"
								>
									<use [attr.href]="iconsURL + '#asterisk'"></use>
								</svg>
							</span>
						</label>
						
						<input
							id="_price"
							formControlName="price"
							class="form-control"
							type="text"
						/>
					</div>
					
					<!-- stocked field -->
					<div class="form-check">
						<input
							id="_stocked"
							formControlName="stocked"
							[checked]="product.stocked"
							class="form-check-input"
							type="checkbox"
							value=""
						/>
						<label class="form-check-label" for="_stocked">
							{{Liferay.Language.get('product-is-in-stock')}}
						</label>
					</div>
				</div>
				
				<!-- edit & cancel button group -->
				<div class="sheet-footer sheet-footer-btn-block-sm-down">
					
					<div class="btn-group">
						
						<div class="btn-group-item">
							<button 
								class="btn btn-primary" 
								type="submit" 
								[disabled]="updateForm.invalid"
							>{{Liferay.Language.get('save')}}</button>
						</div>
						
						<div class="btn-group-item">
							<button 
								class="btn btn-secondary" 
								type="button" 
								(click)="onCancel()"
							>{{Liferay.Language.get('cancel')}}</button>
						</div>
						
					</div>
					
				</div>
				
			</div>
			
		</form>
	`,
	styles: []
})
export class ProductEditComponent {

	iconsURL = config.iconsURL;

	updateForm = new FormGroup({
		name: new FormControl('', [Validators.required]),
		price: new FormControl('', [Validators.required]),
		category: new FormControl('', [Validators.required]),
		stocked: new FormControl(''),
	});

	@Input()
	set product(product: Product) {

		if (product) {

			this._product = product;

			this.updateForm.patchValue(product);

		}

	}

	get product(): Product {

		return this._product;

	}

	@Output() update = new EventEmitter<Product>();

	private _product: Product;

	constructor(private router:Router) {
	}

	onSubmit(): void {

		if (this.updateForm.valid) {

			this.update.emit(this.updateForm.value);

		}

	}

	onCancel(): void {

		this.router.navigate(['/productsPage']);

	}

}