# Book Library UI: Loading and Error States

## Loading
- Show a visible loading indicator while fetching books or book details.
- Prevent duplicate submissions while a save/delete request is pending.
- Keep layout shifts minimal when loading completes.

## Empty states
- Distinguish an empty library from an empty search result.
- Provide a clear way to reset active search and filters.
- Do not show a success state when the request failed.

## Error handling
- Display a human-readable message for network failures and server errors.
- Preserve form input when a recoverable save request fails.
- Handle validation errors next to the relevant field where supported.
- Avoid exposing raw stack traces or internal response details.
- Provide a retry action when repeating the request is safe.

## Accessibility
- Ensure loading and error messages are announced appropriately.
- Keep keyboard focus predictable after dialogs open or close.
- Use text or icons in addition to color to communicate status.
- Verify form controls have accessible labels.

## Manual regression checklist
- [ ] Initial load succeeds.
- [ ] API returns an empty list.
- [ ] API request times out or fails.
- [ ] Create/update succeeds and refreshes visible data.
- [ ] Validation error is displayed.
- [ ] Search has no matches and can be reset.