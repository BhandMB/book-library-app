# Client Error-Handling Rules

The client should treat API failures consistently so users receive actionable feedback.

- `4xx` responses: show a user-facing validation or not-found message and keep the current form state when possible.
- `401` or `403`: explain that the session or permissions are insufficient and avoid retry loops.
- `5xx` responses: show a temporary-service message and allow a deliberate retry.
- Network timeouts: preserve unsent input and make the retry action explicit.
- Unexpected payloads: fail closed, log a safe diagnostic, and avoid rendering raw server content.

Do not expose stack traces, access tokens, or internal identifiers in the UI.
