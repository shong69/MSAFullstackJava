const url = require('url');
const msg = 'https://n.news.naver.com/mnews/article/003/0013305304';

// Url {
//   protocol: 'https:',
//   slashes: true,
//   auth: null,
//   host: 'n.news.naver.com',
//   port: null,
//   hostname: 'n.news.naver.com',
//   hash: null,
//   search: null,
//   query: null,
//   pathname: '/mnews/article/003/0013305304',
//   path: '/mnews/article/003/0013305304',
//   href: 'https://n.news.naver.com/mnews/article/003/0013305304'
// }
console.log(url.parse(msg));

// URL {
//   href: 'https://n.news.naver.com/mnews/article/003/0013305304',
//   origin: 'https://n.news.naver.com',
//   protocol: 'https:',
//   username: '',
//   password: '',
//   host: 'n.news.naver.com',
//   hostname: 'n.news.naver.com',
//   port: '',
//   pathname: '/mnews/article/003/0013305304',
//   search: '',
//   searchParams: URLSearchParams {}, -> 검색 파라미터를 알 수 있음 (각각 구분해서 보여준다)
//   hash: ''
// }
console.log(new url.URL(msg));