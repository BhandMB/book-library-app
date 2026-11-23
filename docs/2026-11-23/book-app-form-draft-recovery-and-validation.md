# Book App Form Draft Recovery and Validation

Date: 2026-11-23

## Purpose
Define how create and edit forms preserve safe user work while maintaining reliable validation.

## Draft behavior
Preserve non-sensitive fields when validation fails or a temporary request error occurs. Do not persist passwords, access tokens, or other secrets in local draft storage. Define when drafts expire and when successful submission clears them.

## Validation
Use client-side validation for immediate feedback and repeat authoritative validation on the server. Keep field errors associated with the correct controls and provide a form-level summary for screen-reader users.

## Conflict handling
If the record changes while being edited, present a conflict state and allow the user to compare or reload rather than silently overwriting newer data.

## Verification
- [ ] Safe form values survive recoverable errors.
- [ ] Sensitive fields are never stored in drafts.
- [ ] Server validation remains authoritative.
- [ ] Successful save clears the correct draft.
- [ ] Concurrent edits are handled explicitly.

## Scope
UX specification only; no form implementation or tests are claimed.