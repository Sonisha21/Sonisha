# Sonisha
REST API Implementation:
Implementing "Create Vehicle" REST API Endpoint using Springboot

Success use case:
- Valid payload should be printed in the console log from the method
- Return corresponding http response code including vehicle id(something like UUID.randomUUID() would be enough) to the client as a part of location header

Path: /vehicle-api/v1/vehicles/vehicle
Content-Type: application/json
Request body: 
{
  "vin": "1A4AABBC5KD501999",
  "year": 2019,
  "make": "FCA",
  "model": "RAM"
  "transmissionType": "MANUAL",
}

