# Interactive prediction function
def predict_farmer_price():
    print(f"\n{'='*70}")
    print("INTERACTIVE PREDICTION - Enter Values for Each Column")
    print('='*70)
   
    # Get original column names (without engineered features)
    original_cols = df.drop(columns=[target]).columns[:len(X.columns) - len(numeric_cols)*2]
   
    # Create input dictionary
    input_data = {}
   
    print("\nPlease enter values for the following columns:")
    print("-" * 70)
   
    for col in X.columns:
        # Skip engineered features for user input
        if '_squared' in col or '_sqrt' in col:
            continue
           
        if col in categorical_cols:
            # Show unique values for categorical columns
            unique_vals = df[col].unique()[:10] # Show first 10 unique values
            print(f"\n{col} (Categorical)")
            print(f" Example values: {', '.join(map(str, unique_vals))}")
            value = input(f" Enter value: ").strip()
            input_data[col] = value
        else:
            # Numeric columns
            min_val = df[col].min()
            max_val = df[col].max()
            mean_val = df[col].mean()
            print(f"\n{col} (Numeric)")
            print(f" Range: {min_val:.2f} to {max_val:.2f}, Mean: {mean_val:.2f}")
            value = input(f" Enter value: ").strip()
            try:
                input_data[col] = float(value)
            except ValueError:
                print(f" Invalid input, using mean value: {mean_val:.2f}")
                input_data[col] = mean_val
   
    # Create DataFrame with input
    input_df = pd.DataFrame([input_data])
   
    # Apply feature engineering (only for existing columns in input)
    for col in input_df.columns:
        if col in numeric_cols and input_df[col].dtype in ['int64', 'float64']:
            input_df[f'{col}_squared'] = input_df[col] ** 2
            input_df[f'{col}_sqrt'] = np.sqrt(np.abs(input_df[col]))
   
    # Ensure all required columns are present
    for col in X.columns:
        if col not in input_df.columns:
            input_df[col] = 0 # Add missing columns with default value
   
    # Reorder columns to match training data
    input_df = input_df[X.columns]
   
    # Make prediction
    predicted_price = final_model.predict(input_df)[0]
   
    print(f"\n{'='*70}")
    print("PREDICTION RESULT:")
    print('='*70)
    print(f"Predicted Farmer Price: ₹{predicted_price:.2f}")
    print('='*70)
   
    # Show input summary
    print("\nInput Summary:")
    for col, val in input_data.items():
        print(f" {col}: {val}")
   
    return predicted_price
# Run interactive predictions
print(f"\n{'='*70}")
print("MANUAL PREDICTION TEST")
print('='*70)
while True:
    choice = input("\nDo you want to make a prediction? (yes/no): ").strip().lower()
    if choice in ['yes', 'y']:
        try:
            predict_farmer_price()
        except KeyboardInterrupt:
            print("\n\nPrediction cancelled.")
            break
        except Exception as e:
            print(f"\nError during prediction: {e}")
    else:
        print("\nExiting prediction mode.")
        break
print("\n" + "="*70)
print("SCRIPT COMPLETED SUCCESSFULLY!")
print("="*70)
# Show comparison table
## print(f"\n{'='*50}")
print("MODEL COMPARISON (Validation Set)")
print('='*50)
print(f"{'Model':<25} {'MAE':<12} {'RMSE':<12} {'R²':<12}")
print('-'*50)
for name, metrics in results.items():
    print(f"{name:<25} {metrics['MAE']:<12.3f} {metrics['RMSE']:<12.3f} {metrics['R2']:<12.3f}")
print('='*50) during trainning time tested data Please enter values for the following columns:
# productname (Categorical)
  Example values: Strawberries, Romaine Lettuce, Red Leaf Lettuce, Potatoes, Oranges, Iceberg Lettuce, Green Leaf Lettuce, Celery, Cauliflower, Carrots
  Enter value: Strawberries
date (Categorical)
  Example values: 2019-05-19, 2019-05-12, 2019-05-05, 2019-04-28, 2019-04-21, 2019-04-14, 2019-04-07, 2019-03-31, 2019-03-24, 2019-03-17
  Enter value: 2019-05-19
averagespread (Categorical)
  Example values: 82.33%, 428.57%, 467.19%, 244.50%, 281.71%, 335.71%, 450.00%, -18.20%, 198.98%, 328.13%
  Enter value: 82.33
atlantaretail_INR (Numeric)
  Range: 0.00 to 594.83, Mean: 157.43
  Enter value: 183.97
chicagoretail_INR (Numeric)
  Range: 0.00 to 514.80, Mean: 162.10
  Enter value: 140.25
losangelesretail_INR (Numeric)
  Range: 0.00 to 615.45, Mean: 156.45
  Enter value: 164.18
newyorkretail_INR (Numeric)
  Range: 0.00 to 968.55, Mean: 179.80
  Enter value: 209.55
location (Categorical)
  Example values: Ballari, Hubballi, Mangaluru, Bengaluru, Davangere, Belagavi, Shivamogga, Mysuru
  Enter value: Ballari
categories (Categorical)
  Example values: Fruits, Vegetables
  Enter value: Fruits
quality (Categorical)
  Example values: GradeA, GradeC, GradeB, GradeD
  Enter value: GradeA
FarmerName (Categorical)
  Example values: Farmer_1, Farmer_2, Farmer_3, Farmer_4, Farmer_5, Farmer_6, Farmer_7, Farmer_8, Farmer_9, Farmer_10
  Enter value: Farmer_1
FarmerLocation (Categorical)
  Example values: Hubballi, Belagavi, Mangaluru, Bengaluru, Mysuru, Shivamogga, Ballari, Davangere
  Enter value: Hubballi
Quantity_kg (Numeric)
  Range: 10.00 to 100.00, Mean: 55.37
  Enter value: 62kg
  Invalid input, using mean value: 55.37
# PREDICTION RESULT:
# Predicted Farmer Price: ₹78.60
Input Summary:
  productname: Strawberries
  date: 2019-05-19
  averagespread: 82.33
  atlantaretail_INR: 183.97
  chicagoretail_INR: 140.25
  losangelesretail_INR: 164.18
  newyorkretail_INR: 209.55
  location: Ballari
  categories: Fruits
  quality: GradeA
  FarmerName: Farmer_1
  FarmerLocation: Hubballi
  Quantity_kg: 55.373644429838976 model give correct price prediction please check resolve the prolem full code of app.py inde.html and result.html accurate answer give
