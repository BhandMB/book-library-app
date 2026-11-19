# Search State and URL Synchronization

## Objective
Make searches shareable and ensure browser navigation restores the visible search state.

## State contract
Define which values belong in the URL, such as search term, page, sort order, and selected category. Keep transient UI state, such as an open menu, out of the URL unless there is a clear user benefit.

## Expected behavior
- Submitting a new search resets pagination to the first page.
- Back and forward navigation restore the prior query and result state.
- Invalid or unsupported query parameters fall back safely.
- Search text is encoded and decoded consistently.
- Sensitive user information is never placed in query parameters.

## Test scenarios
Test direct navigation to a search URL, refresh, browser back/forward, empty search, special characters, and changing filters while on a later page.

## Accessibility
Ensure search submission and result-count changes are communicated clearly to assistive technology.