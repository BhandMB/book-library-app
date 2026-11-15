# Book App Release Smoke Tests

## Critical path
1. Load the application and verify the initial state.
2. Sign in with a valid account and reject invalid credentials safely.
3. Search, filter, and open a book detail view.
4. Create or edit a book where the current role permits it.
5. Verify validation, loading, empty, and server-error states.
6. Sign out and confirm protected views are no longer accessible.

Run the critical path in supported desktop and narrow mobile viewports. Record build identifier, browser, outcome, and known limitations. Block release for data loss or authorization bypass.