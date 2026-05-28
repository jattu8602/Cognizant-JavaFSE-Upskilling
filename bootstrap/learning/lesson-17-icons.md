# Lesson 17: Bootstrap Icons

Bootstrap Icons is a free, open-source icon library designed for Bootstrap components.

## Setup

```html
<!-- CDN -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">

<!-- npm -->
npm install bootstrap-icons
```

## Basic Usage

```html
<i class="bi bi-alarm"></i>
<i class="bi bi-star"></i>
<i class="bi bi-heart"></i>
<i class="bi bi-person-circle"></i>
<i class="bi bi-gear"></i>
```

## Sizing

Use Bootstrap's font-size utilities:

```html
<i class="bi bi-circle fs-1"></i>   <!-- Largest (2.5rem) -->
<i class="bi bi-circle fs-3"></i>   <!-- 1.75rem -->
<i class="bi bi-circle fs-6"></i>   <!-- Default (1rem) -->

<!-- Or custom -->
<i class="bi bi-circle" style="font-size: 3rem;"></i>
```

## Styling

```html
<i class="bi bi-trash text-danger"></i>
<i class="bi bi-check-circle text-success"></i>
<i class="bi bi-info-circle text-primary"></i>
<i class="bi bi-exclamation-triangle text-warning"></i>
```

## Common Icons by Category

### Actions
```html
<i class="bi bi-plus-circle"></i>      <!-- Add -->
<i class="bi bi-pencil"></i>           <!-- Edit -->
<i class="bi bi-trash"></i>            <!-- Delete -->
<i class="bi bi-search"></i>           <!-- Search -->
<i class="bi bi-download"></i>         <!-- Download -->
<i class="bi bi-upload"></i>           <!-- Upload -->
<i class="bi bi-save"></i>             <!-- Save -->
```

### Navigation
```html
<i class="bi bi-house"></i>            <!-- Home -->
<i class="bi bi-person"></i>           <!-- User/Profile -->
<i class="bi bi-envelope"></i>         <!-- Mail -->
<i class="bi bi-bell"></i>             <!-- Notifications -->
<i class="bi bi-box-arrow-right"></i>  <!-- Logout -->
<i class="bi bi-arrow-left"></i>       <!-- Back -->
```

### Status
```html
<i class="bi bi-check-circle"></i>          <!-- Success -->
<i class="bi bi-x-circle"></i>              <!-- Error -->
<i class="bi bi-exclamation-triangle"></i>  <!-- Warning -->
<i class="bi bi-info-circle"></i>           <!-- Info -->
<i class="bi bi-question-circle"></i>       <!-- Help -->
```

### Social / Brands
```html
<i class="bi bi-github"></i>
<i class="bi bi-twitter-x"></i>
<i class="bi bi-linkedin"></i>
<i class="bi bi-facebook"></i>
<i class="bi bi-instagram"></i>
<i class="bi bi-youtube"></i>
```

### UI Elements
```html
<i class="bi bi-x"></i>                <!-- Close -->
<i class="bi bi-list"></i>             <!-- Menu/Hamburger -->
<i class="bi bi-chevron-down"></i>     <!-- Chevron -->
<i class="bi bi-three-dots"></i>       <!-- More options -->
<i class="bi bi-sliders"></i>          <!-- Settings/Filters -->
```

## Using Icons in Buttons

```html
<button class="btn btn-primary">
  <i class="bi bi-star"></i> Favorite
</button>

<button class="btn btn-outline-danger">
  <i class="bi bi-trash"></i> Delete
</button>
```

## Icon as Link

```html
<a href="#" class="text-decoration-none">
  <i class="bi bi-envelope fs-3"></i>
</a>
```

---

## Interview Questions

**Q: How do you add Bootstrap Icons to a project?**
A: Either include the CDN stylesheet link in `<head>`, or install via npm (`npm install bootstrap-icons`) and import the CSS.

**Q: How do you change the size of a Bootstrap icon?**
A: Use Bootstrap font-size utilities like `fs-1` through `fs-6`, or set a custom `font-size` inline. Icons are font-based, so font-size controls their size.

**Q: How do you color Bootstrap icons?**
A: Use text color utilities: `text-danger`, `text-success`, `text-primary`, etc. Since icons are rendered as fonts, text color classes work directly.

**Q: Can you use Bootstrap Icons without Bootstrap CSS?**
A: Yes. Bootstrap Icons is a standalone library. You only need the `bootstrap-icons.css` stylesheet — you don't need the full Bootstrap framework to use the icons.
