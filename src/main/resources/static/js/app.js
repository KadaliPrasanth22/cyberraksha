document.addEventListener('DOMContentLoaded', () => {
  const select = document.getElementById('languageSelect');
  if (!select) return;
  const params = new URLSearchParams(window.location.search);
  const current = params.get('lang') || localStorage.getItem('cyberraksha-language') || 'en';
  select.value = current;
  select.addEventListener('change', () => {
    const lang = select.value;
    localStorage.setItem('cyberraksha-language', lang);
    const url = new URL(window.location.href);
    url.searchParams.set('lang', lang);
    window.location.href = url.toString();
  });
});
