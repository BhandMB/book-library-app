# Client Error-State Guide — 2026-09-06

A consistent client should make failure states actionable instead of silently failing.

## Recommended states

- **Validation error:** explain which input needs correction.
- **Unauthorized:** explain that the session is missing or expired.
- **Not found:** explain that the requested resource is unavailable.
- **Conflict:** explain that the action could not be completed because data changed.
- **Server error:** provide a retry path without exposing internal details.
- **Offline/timeout:** show that connectivity is the likely cause.

## Verification

For each state, confirm the UI preserves the user's input when safe, avoids duplicate submissions, and gives a clear next action.