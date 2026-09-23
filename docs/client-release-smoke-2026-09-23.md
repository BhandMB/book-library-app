# Client Release Smoke Checks

- App launches with a clean install.
- Loading, empty, success, validation, auth, timeout, and server-error states are visible.
- Retry does not duplicate requests or stale list entries.
- Refresh preserves the selected screen and clears obsolete errors.
- API failures remain understandable without exposing implementation details.
