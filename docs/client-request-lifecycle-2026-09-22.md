# Client Request Lifecycle — 2026-09-22

1. Enter loading state before the request starts.
2. Disable duplicate submit actions while the request is pending.
3. On validation failure, keep user input and show actionable field feedback.
4. On `401/403`, show an authentication or permission message without retrying blindly.
5. On timeout or network failure, offer retry without losing local state.
6. On success, refresh the visible data and clear stale error banners.

## Verification
A manual test should cover one success, one validation error, one authorization error, one timeout, and one malformed response.