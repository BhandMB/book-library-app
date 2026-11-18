# Keyboard Accessibility Review

## Scope
Review navigation, search, book forms, dialogs, and feedback states without relying on a mouse.

## Expected behavior
- Every interactive control is reachable in a logical tab order.
- Focus indicators remain visible against the page background.
- Dialogs receive focus on open, keep focus within the modal, and restore focus on close.
- Enter and Space activate controls according to their semantics.
- Escape closes dismissible overlays without discarding unsaved work silently.
- Form errors are associated with their inputs and announced to assistive technology.

## Manual test path
Navigate the full app using Tab, Shift+Tab, Enter, Space, and Escape. Test at 200% zoom and inspect focus after route changes and asynchronous loading.

## Defect record
For each issue, capture route, steps, expected behavior, actual behavior, severity, and a screenshot or short recording. This document defines checks; it does not claim they have been executed.