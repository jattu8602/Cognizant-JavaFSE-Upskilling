# CSS3 - Introduction & Basics

## What is CSS?

- **CSS** stands for **Cascading Style Sheets**
- Describes how HTML elements are displayed on screen, paper, or other media
- Controls layout of multiple web pages from a single file
- Saves work by centralizing style definitions in external `.css` files

## CSS Syntax

```css
selector {
  property: value;
}
```

- **Selector** - points to the HTML element to style
- **Declaration block** - contains one or more `property: value;` pairs
- Each declaration includes a property name and a value, separated by a colon

Example:

```css
h1 {
  color: blue;
  font-size: 24px;
}
```

## How to Add CSS

### 1. External CSS (Best Practice)

Create a `.css` file and link it in `<head>`:

```html
<link rel="stylesheet" href="styles.css">
```

- Can change entire website by editing one file
- Cached by browsers for faster loading

### 2. Internal CSS

Use `<style>` tag inside `<head>`:

```html
<style>
  body { background-color: linen; }
</style>
```

- Useful for a single page with unique styles

### 3. Inline CSS

Add `style` attribute directly to an element:

```html
<h1 style="color:blue;">Heading</h1>
```

- Overrides external and internal styles
- Loses the advantage of style sheets (mixes content with presentation)

## Cascading Order

When multiple styles conflict, the following order applies (highest to lowest):

1. Inline style (inside HTML element)
2. External and internal style sheets (in the head section)
3. Browser default

Inline > Internal/External > Browser default

## CSS Comments

```css
/* This is a single-line comment */

/*
  This is a
  multi-line comment
*/
```

## CSS Colors

### Named Colors

```css
color: red;
color: tomato;
color: dodgerblue;
```

### RGB / RGBA

```css
color: rgb(255, 99, 71);
color: rgba(255, 99, 71, 0.5); /* a = alpha (0-1) */
```

### HEX

```css
color: #ff6347;
/* shorthand: #f37 */
```

### HSL / HSLA

```css
color: hsl(9, 100%, 64%);
color: hsla(9, 100%, 64%, 0.5);
```

- **H**ue: degree on color wheel (0-360)
- **S**aturation: percentage (0% gray - 100% full)
- **L**ightness: percentage (0% black - 100% white)

## CSS Backgrounds

### Background Color

```css
background-color: lightblue;
```

### Background Image

```css
background-image: url("image.png");
```

### Background Repeat

```css
background-repeat: repeat-x;   /* horizontal */
background-repeat: repeat-y;   /* vertical */
background-repeat: no-repeat;  /* no repeat */
```

### Background Attachment

```css
background-attachment: fixed;   /* scrolls with page */
background-attachment: scroll;  /* stays in place */
```

### Background Position

```css
background-position: right top;
background-position: center center;
```

### Background Shorthand

```css
background: #ffffff url("img.png") no-repeat right top;
/* Order: color image repeat attachment position */
```

## CSS Fonts

### Font Family

```css
font-family: "Times New Roman", Times, serif;
font-family: Arial, Helvetica, sans-serif;
```

- List fallback fonts, separated by commas
- Use quotes for font names with spaces

### Web Safe Fonts

- Arial, Verdana, Helvetica, Tahoma, Trebuchet MS, Times New Roman, Georgia, Garamond, Courier New

### Font Style

```css
font-style: normal;
font-style: italic;
font-style: oblique;
```

### Font Size

```css
font-size: 16px;        /* absolute */
font-size: 1.5em;       /* relative to parent (1em = 16px default) */
font-size: 100%;        /* percentage */
font-size: 2vw;         /* viewport width */
```

### Font Weight

```css
font-weight: normal;    /* 400 */
font-weight: bold;      /* 700 */
```

### Google Fonts

```html
<link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
```

```css
font-family: "Roboto", sans-serif;
```

### Font Shorthand

```css
font: italic small-caps bold 16px/1.5 Arial, sans-serif;
/* Order: style variant weight size/line-height family */
```

## CSS Text

### Text Color

```css
color: #333;
```

### Text Alignment

```css
text-align: left;
text-align: right;
text-align: center;
text-align: justify;
```

### Text Decoration

```css
text-decoration: none;        /* remove underline from links */
text-decoration: underline;
text-decoration: overline;
text-decoration: line-through;
```

### Text Transformation

```css
text-transform: uppercase;
text-transform: lowercase;
text-transform: capitalize;
```

### Text Spacing

```css
text-indent: 50px;          /* first line indent */
letter-spacing: 3px;        /* character spacing */
line-height: 1.8;           /* line spacing */
word-spacing: 10px;         /* word spacing */
white-space: nowrap;        /* no wrapping */
```

### Text Shadow

```css
text-shadow: 2px 2px 5px red;
/* horizontal-shadow vertical-shadow blur-radius color */
```

## CSS Links

### Link States

```css
/* unvisited link */
a:link { color: red; }

/* visited link */
a:visited { color: green; }

/* mouse over link */
a:hover { color: hotpink; }

/* selected link */
a:active { color: blue; }
```

- Must be in order: `:link` → `:visited` → `:hover` → `:active`
- Remove underline: `text-decoration: none;`
- Style as button: add `background-color`, `padding`, `border`, etc.

## CSS Lists

```css
/* Remove default markers */
ul { list-style-type: none; }

/* Custom bullet */
ul { list-style-type: square; }

/* Image as bullet */
ul { list-style-image: url("bullet.png"); }

/* Position */
ul { list-style-position: inside; }   /* bullet inside list item */
ul { list-style-position: outside; }  /* bullet outside (default) */

/* Shorthand */
ul { list-style: square inside url("bullet.png"); }
```

## CSS Tables

### Table Borders

```css
table, th, td { border: 1px solid black; }
```

### Collapse Borders

```css
table { border-collapse: collapse; }
/* or border-collapse: separate; */
```

### Width & Height

```css
table { width: 100%; }
th { height: 50px; }
```

### Alignment

```css
td { text-align: center; }   /* horizontal */
td { vertical-align: top; }  /* vertical */
```

### Striped Rows

```css
tr:nth-child(even) { background-color: #f2f2f2; }
```

### Hover Effect

```css
tr:hover { background-color: #ddd; }
```

### Responsive Table

```css
<div style="overflow-x: auto;">
  <table>...</table>
</div>
```
