# Book Library App Session Expiry and Reauthentication UX

## Purpose
Define a clear user experience when an authenticated session expires during app use.

## Expected behavior
- Detect an authentication expiry response consistently.
- Preserve safe unsaved form data where feasible.
- Clear protected cached data when the session is no longer valid.
- Redirect to sign-in without creating redirect loops.
- Return the user to the intended page after successful reauthentication when safe.
- Explain when an action must be reviewed or submitted again.

## Security requirements
Never keep expired credentials active because the UI still appears signed in. Do not automatically replay a non-idempotent write after reauthentication unless the backend provides a safe idempotency mechanism.

## Test scenarios
- Session expires on a read request.
- Session expires during a form submission.
- Multiple requests fail with expiry at once.
- User signs in again in another tab.
- Logout occurs while a request is pending.
- Protected data is not visible after sign-out.

## Accessibility
Move focus to the sign-in or expiry notice appropriately and provide a clear explanation without exposing token details.
