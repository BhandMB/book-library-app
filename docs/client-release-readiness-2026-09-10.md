# Client Release Readiness — 2026-09-10

## User flows
- Load the book list with an empty, loading, success, and failure state.
- Verify search results update without stale data after a second request.
- Confirm form validation is visible before submission.
- Check that retry actions do not duplicate requests or records.

## Accessibility and resilience
- Interactive controls need meaningful labels and keyboard focus.
- Error messages should explain the next action a user can take.
- Long titles and missing cover images should not break the layout.
- The client should handle slow or unavailable API responses gracefully.
