# ITMO University
### Drools Engine Task 1

Rules added to implement miles accrual business rules based on customer's loyality status<br>
API Endpoint `api/loyalti/miles/updateMilesBalance` return updated entity in following format:
```json
{
    "user": "morshinina",
    "loyalityStatus": "CLASSIC",
    "flightDistance": 1000,
    "milesAccountPerFlight": 500
}
```
to the following sent request:
```json
{
  "user":"morshinina",
  "loyalityStatus": "CLASSIC",
  "flightDistance":2000
}
```