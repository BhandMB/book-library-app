# Frontend API Failure Handling

This guide describes expected UI behavior when API requests fail. Align implementation details with the application's existing request utilities and component patterns.

## User-facing states
- Loading: show a clear progress state and prevent accidental duplicate submissions where appropriate.
- Empty: distinguish a successful empty result from a failed request.
- Validation: show field-specific messages when the server provides safe validation details.
- Unauthorized: follow the application's sign-in/session flow without exposing protected data.
- Server/network failure: show a concise retry message and preserve user-entered data when safe.

## Implementation checklist
- [ ] Handle non-success HTTP responses explicitly.
- [ ] Avoid displaying raw stack traces or server internals.
- [ ] Prevent stale requests from overwriting newer search results where relevant.
- [ ] Keep retry actions accessible and clearly labeled.
- [ ] Avoid infinite automatic retry loops.
- [ ] Log diagnostic details only through the project's approved development/monitoring approach.

## Test scenarios
- [ ] Successful request with data.
- [ ] Successful request with an empty collection.
- [ ] Validation response.
- [ ] Expired or missing authentication.
- [ ] Server error and network disconnection.