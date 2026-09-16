# Form Submission Safety

Forms should avoid duplicate writes and make validation behavior consistent.

## Submission rules
- Disable or guard the submit action while the request is in flight.
- Keep client-side validation aligned with the server contract, without treating it as the security boundary.
- Preserve user input when a request fails and avoid clearing fields unexpectedly.
- Show a success state only after the server confirms the write.

## Tests
Cover rapid repeated clicks, invalid fields, server-side validation errors, network failures, and retry after failure.