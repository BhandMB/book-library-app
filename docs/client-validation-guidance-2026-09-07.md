# Client Validation Guidance — 2026-09-07

- Validate required fields before sending a request.
- Match client-side limits with the API contract, but keep server validation authoritative.
- Show field-level feedback without clearing valid user input.
- Disable duplicate submissions while a request is in flight.
- Preserve the user's entered values when the server returns a validation error.
- Cover empty, whitespace-only, maximum-length, and malformed identifier cases.