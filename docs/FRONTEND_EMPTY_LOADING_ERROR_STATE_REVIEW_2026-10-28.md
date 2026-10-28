# Frontend Loading, Empty, and Error State Review

**Date:** 2026-10-28  
**Purpose:** Ensure users can distinguish a successful empty result from a request that failed.

## State contract

- **Loading:** Show a visible progress indicator and prevent duplicate actions where appropriate.
- **Success with data:** Render the returned content.
- **Success without data:** Show an informative empty state and a useful next action.
- **Failure:** Explain the failure in user-friendly terms and offer a safe recovery action.
- **Timeout:** Make clear that the request did not complete; do not assume a write failed if the server may have processed it.

## Review checklist

- [ ] State transitions are explicit and do not leave stale errors visible after success.
- [ ] Retrying a read is safe and repeatable.
- [ ] Retrying a write is guarded against accidental duplicate creation.
- [ ] Loading and error messages are accessible to assistive technology.
- [ ] Navigating away during a request does not update an obsolete view.
- [ ] Empty state wording matches the active search/filter criteria.

## Manual test record

For each case, record route, browser, test data, observed result, expected result, and issue link. Do not mark a case passed without performing it.