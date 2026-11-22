# Book App Release Smoke Test Plan

Date: 2026-11-22

## Purpose
Define a compact set of checks to run on a release candidate.

## Core journeys
1. Launch the app and verify the initial screen.
2. Search for a known book and inspect result details.
3. Open a book record and verify displayed metadata.
4. Exercise the primary create or update journey if supported.
5. Verify empty, loading, validation, and server-error states.
6. Sign out and confirm protected content is no longer accessible.

## Environment checks
Record build identifier, API environment, device/browser, viewport, and test account role. Use non-production test data and avoid capturing secrets in screenshots.

## Exit criteria
All critical journeys pass, known defects are documented, and the tested build matches the artifact intended for release.

## Checklist
- [ ] Fresh install or clean browser session tested.
- [ ] Primary journeys checked.
- [ ] Responsive layout reviewed.
- [ ] API failure states checked.
- [ ] Release notes reflect known limitations.

## Scope
Test plan only; no release smoke tests were run.