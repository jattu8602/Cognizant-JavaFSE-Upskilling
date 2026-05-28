# Lesson 16: JavaScript Plugins (Tooltips, Popovers, Toasts, Offcanvas)

Bootstrap 5 uses **vanilla JavaScript** (no jQuery). Include `bootstrap.bundle.min.js` which includes Popper.

## Tooltips

Must be **initialized manually** with JavaScript.

```html
<button type="button" class="btn btn-secondary" data-bs-toggle="tooltip"
        title="Tooltip on top">
  Hover me
</button>

<script>
  const tooltipTriggerList = document.querySelectorAll('[data-bs-toggle="tooltip"]');
  const tooltipList = [...tooltipTriggerList].map(el => new bootstrap.Tooltip(el));
</script>
```

### Tooltip Placement

```html
<button title="Top" data-bs-placement="top">Top</button>
<button title="Bottom" data-bs-placement="bottom">Bottom</button>
<button title="Left" data-bs-placement="start">Left</button>
<button title="Right" data-bs-placement="end">Right</button>
```

## Popovers

Also need **manual initialization**.

```html
<button type="button" class="btn btn-danger" data-bs-toggle="popover"
        title="Popover title" data-bs-content="Content here.">
  Click to toggle
</button>

<script>
  const popoverTriggerList = document.querySelectorAll('[data-bs-toggle="popover"]');
  const popoverList = [...popoverTriggerList].map(el => new bootstrap.Popover(el));
</script>
```

## Toasts

Lightweight notifications that can be shown programmatically.

```html
<!-- Toast (hidden by default) -->
<div class="toast" id="myToast" role="alert">
  <div class="toast-header">
    <strong class="me-auto">Notification</strong>
    <button type="button" class="btn-close" data-bs-dismiss="toast"></button>
  </div>
  <div class="toast-body">Hello! This is a toast message.</div>
</div>

<button onclick="showToast()">Show Toast</button>

<script>
  function showToast() {
    const toast = new bootstrap.Toast(document.getElementById('myToast'));
    toast.show();
  }
</script>
```

### Toast Options

```javascript
const toast = new bootstrap.Toast(element, {
  animation: true,
  autohide: true,
  delay: 5000  // auto-hide after 5 seconds
});
```

## Offcanvas

Sidebar-like panel that slides in from the edge.

```html
<button data-bs-toggle="offcanvas" data-bs-target="#offcanvasExample">
  Toggle Offcanvas
</button>

<div class="offcanvas offcanvas-start" tabindex="-1" id="offcanvasExample">
  <div class="offcanvas-header">
    <h5 class="offcanvas-title">Offcanvas</h5>
    <button type="button" class="btn-close" data-bs-dismiss="offcanvas"></button>
  </div>
  <div class="offcanvas-body">
    Content here
  </div>
</div>
```

### Offcanvas Placements

```html
<div class="offcanvas offcanvas-start">...</div>  <!-- Left (default) -->
<div class="offcanvas offcanvas-end">...</div>    <!-- Right -->
<div class="offcanvas offcanvas-top">...</div>     <!-- Top -->
<div class="offcanvas offcanvas-bottom">...</div>  <!-- Bottom -->
```

### Offcanvas via JS

```javascript
const offcanvas = new bootstrap.Offcanvas(document.getElementById('myOffcanvas'));
offcanvas.show();
offcanvas.hide();
```

## Collapse (Independent)

```html
<button data-bs-toggle="collapse" data-bs-target="#content">Toggle</button>
<div class="collapse" id="content">Expandable content</div>
```

---

## Interview Questions

**Q: Why do tooltips and popovers need JavaScript initialization?**
A: For performance. Initializing all tooltips on page load is expensive if there are hundreds. The selector-based initialization (`querySelectorAll`) lets you choose which elements get tooltips.

**Q: What is the difference between a tooltip and a popover?**
A: A tooltip shows a small text on hover. A popover shows a larger content box with a title and body on click. Popovers use Popper.js (included in the bundle) for positioning.

**Q: What are the four placement directions for offcanvas?**
A: `.offcanvas-start` (left, default), `.offcanvas-end` (right), `.offcanvas-top` (top), `.offcanvas-bottom` (bottom).

**Q: How do you set a toast to auto-hide after 3 seconds?**
A: Pass options when creating: `new bootstrap.Toast(element, { delay: 3000, autohide: true })`. Or with data attributes: `data-bs-delay="3000"`.
