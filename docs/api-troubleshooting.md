# API Troubleshooting Guide

Use this guide when the client cannot load or update library data.

## 1. Confirm the API endpoint
Check the configured base URL and verify that the API process is running before changing client code.

## 2. Classify the failure
- **4xx:** inspect request parameters, validation messages, authentication, and authorization.
- **5xx:** inspect server logs and reproduce the request directly against the API.
- **Timeout/network error:** verify connectivity, host/port configuration, and retry behavior.
- **Empty response:** confirm whether the API returned a legitimate empty collection or whether parsing failed.

## 3. Reproduce before fixing
Record the endpoint, HTTP method, status code, request shape, and response body (excluding secrets). A reproducible request is preferable to debugging from a UI symptom alone.

## 4. Regression check
After a fix, verify loading, successful creation/update, validation failure, server failure, and retry/error-state rendering so the client remains resilient across common API outcomes.
