# Book App Session Expiry UX

When an authenticated session expires, preserve safe unsent form input where practical, explain that the session ended, and provide a clear sign-in path.

## Avoid
- Redirect loops between protected pages and login.
- Raw server errors or stack traces.
- Automatically replaying a write request after re-authentication without user confirmation.

## Test scenarios
Expire a session on a list page, while editing a book, and during a failed request. Verify keyboard navigation, focus placement, and that private data is not exposed after logout.