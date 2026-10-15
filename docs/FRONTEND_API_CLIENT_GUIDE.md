# Frontend API Client Conventions

Keep HTTP communication consistent so UI components can focus on presentation and user interaction.

## Request handling
- Centralize the API base URL and environment-specific configuration.
- Use a consistent pattern for JSON headers and response parsing.
- Handle non-success status codes explicitly; a resolved network request is not always a successful operation.
- Distinguish server responses from network or timeout failures.
- Avoid logging credentials or sensitive request data.

## UI state
- Represent loading, success, empty, and error states explicitly.
- Prevent duplicate mutations while a request is pending.
- Provide a retry action only when retrying is safe.
- Keep error messages understandable and avoid exposing raw internals.

## Verification
- [ ] Test successful list and detail requests.
- [ ] Test empty collections.
- [ ] Test validation and not-found responses.
- [ ] Test offline/network failure behavior.
- [ ] Test create/update/delete refresh behavior.
- [ ] Confirm configured URLs work in local and deployed environments.