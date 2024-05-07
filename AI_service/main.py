from flask import Flask, request, jsonify
from joblib import load

app = Flask(__name__)

# Load the saved model
rf_model = load('model/random_forest_model.joblib')


@app.route('/predict-price-range', methods=['POST'])
def predict():
    data = request.json  # Assuming JSON data is sent for prediction
    # Assuming your data is in the correct format for prediction
    sample = [data['feature1'], data['feature2'], ...]  # Adjust according to your features
    prediction = rf_model.predict([sample])
    return jsonify({'prediction': prediction.tolist()})


if __name__ == '__main__':
    app.run(debug=True)
