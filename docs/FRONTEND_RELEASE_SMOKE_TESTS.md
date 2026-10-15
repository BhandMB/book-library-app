# Frontend Release Smoke Tests

Run these checks after a frontend release or a significant UI/API integration change.

## Startup and navigation
- [ ] Application starts without a blocking console error.
- [ ] Primary routes load and navigation links work.
- [ ] Refreshing a nested route behaves as expected in the deployment environment.

## Library workflows
- [ ] Book list loads and renders expected fields.
- [ ] Search and filters update results correctly.
- [ ] Details view handles a missing or invalid identifier.
- [ ] Create and edit flows show success only after the server confirms success.
- [ ] Delete flow asks for confirmation where appropriate and updates the list afterward.

## Resilience and accessibility
- [ ] Loading and empty states are visible.
- [ ] API failures produce a recoverable message.
- [ ] Keyboard navigation reaches all interactive controls.
- [ ] Forms have labels and visible validation feedback.
- [ ] Layout remains usable at narrow viewport widths.

Record release date, tested environment, and any known limitations in the release notes.