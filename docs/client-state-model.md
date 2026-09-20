# Client State Model

The client should keep UI state explicit for each API request.

## States

- `idle`: no request is active.
- `loading`: request started; disable duplicate submit actions.
- `success`: data is available; render the updated list or detail view.
- `validation-error`: show field-level feedback and keep safe user input.
- `unauthorized`: clear stale session state and route to sign-in.
- `forbidden`: explain that the current account lacks permission.
- `not-found`: show a recoverable missing-resource message.
- `server-error`: show a retry action without losing the current screen context.
- `network-error`: show offline/timeout guidance and allow retry.

Transitions should be driven by the HTTP result and should not depend on parsing human-readable error text. Keep loading indicators scoped to the affected action so the rest of the interface remains usable.