const express = require("express");
const router = express.Router();

router.get('/',(req,res)=>{
    res.send('emp list');
});
router.get('/detail',(req,res)=>{
    var empno = req.query.empno;
    res.send(`emp (${empno}) detail`);
});
router.get('/',(req,res)=>{
    res.send('list page');
});
module.exports = router;

