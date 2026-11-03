# Book Library App API Failure and Recovery States

Date: 2026-11-03

## Expected UI states
- Loading: show a clear progress indicator and prevent accidental duplicate submissions.
- Empty: explain that no books match the current query and offer a way to clear filters.
- Validation: show field-level guidance while preserving safe user-entered values.
- Unauthorized: explain that the session or permissions do not allow the action.
- Not found: show a useful message and a route back to the collection.
- Server/network failure: show a retry action without exposing raw server details.

## Resilience checks
- Prevent duplicate create/update requests during submission.
- Keep pagination and filters stable after recoverable failures.
- Avoid optimistic UI changes unless rollback behavior is defined.
- Ensure stale data is not presented as a successful fresh response.

## Test evidence
Capture the simulated status code, visible message, retry behavior, and final state for each scenario. Align exact behavior with the app's API client and routing implementation.