# Client Failure Recovery

The client should keep user actions understandable when an API request fails.

## State rules

- Show a loading state only while the request is active.
- Preserve user-entered form values after a validation or network failure.
- Treat 401 and 403 as authorization states, not generic server errors.
- Treat timeouts and offline failures as retryable.
- Treat malformed success payloads as unexpected responses and log enough context to debug without exposing secrets.

## Manual verification

1. Submit a valid request and confirm the success state.
2. Submit invalid data and confirm field-level feedback.
3. Simulate a timeout and retry without losing input.
4. Simulate an unauthorized response and confirm the sign-in path.
