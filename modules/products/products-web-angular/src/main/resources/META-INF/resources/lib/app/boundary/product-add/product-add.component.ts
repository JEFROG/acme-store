import { Component, EventEmitter, Output } from '@angular/core';
import { ActivatedRoute, Router } from "@angular/router";
import { FormControl, FormGroup, Validators } from "@angular/forms"

import { Product } from "../../entity/product";
import { config } from "../../config";



@Component({
	selector: 'app-product-add-ui',
	template: `
		<form [formGroup]="addForm" (ngSubmit)="onSubmit()">
			
			<div class="sheet sheet-lg">
				
				<div class="sheet-header">
					<h2 class="sheet-title">{{Liferay.Language.get('add-product')}}</h2>
				</div>
				
				<div class="sheet-section">
					
					<!-- Category Field -->
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
							<option value="" disabled selected>{{Liferay.Language.get('select-a-category')}}</option>
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
							placeholder=Liferay.Language.get('enter-name')
							type="text"
						/>
					</div>
					
					<!-- price field -->
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
							placeholder=Liferay.Language.get('enter-price')
							type="text"
						/>
					</div>
					
					<!-- stocked field -->
					<div class="form-check">
						<input
							id="_stocked"
							formControlName="stocked"
							class="form-check-input"
							type="checkbox"
							value=""
						/>
						
						<label 
							class="form-check-label" 
							for="_stocked">
							{{Liferay.Language.get('product-is-in-stock')}}
						</label>
					</div>
					
				</div>
				
				<!-- add & cancel button group -->
				<div class="sheet-footer sheet-footer-btn-block-sm-down">
					
					<div class="btn-group">
						
						<div class="btn-group-item">
							<button 
								class="btn btn-primary" 
								type="submit" 
								[disabled]="addForm.invalid"
							>{{Liferay.Language.get('add')}}</button>
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
export class ProductAddComponent {

	iconsURL = config.iconsURL;

	addForm = new FormGroup({
		name: new FormControl('', [Validators.required]),
		price: new FormControl('', [Validators.required]),
		category: new FormControl('', [Validators.required]),
		stocked: new FormControl(false),
	});

	@Output() add = new EventEmitter<Product>();

	constructor(private route: ActivatedRoute, private router:Router) {
	}

	onSubmit(): void {
		if (this.addForm.valid) {
			this.add.emit(this.addForm.value);
		}
	}

	onCancel(): void {
		this.router.navigate(['/productsPage']);
	}
}