<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>PAY</title>
</head>
<body>
<div id="myQrcode"></div>
<div id="orderId">${orderId}</div>
<div id="returnURL">${returnUrl}</div>
<script src="https://cdn.bootcss.com/jquery/1.5.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/jquery.qrcode/1.0/jquery.qrcode.min.js"></script>
<script>
    jQuery('#myQrcode').qrcode({
        text	: "${codeUrl}"
    });

    $(function(){
        setInterval(function() {
            console.log('开始查询支付状态')
            $.ajax({
                'url': 'queryByOrderId',
                data: {
                    'orderId': $('#orderId').text()
                },
                success: function (result) {
                    console.log(result)
                    if (result.platformStatus != null
                        && result.platformStatus === 'SUCCESS') {
                        location.href = $('#returnURL').text()
                    }
                },
                error: function(result) {
                    alert(result)
                    console.log(result)

                }
            })

        }, 2000)
    })
</script>
</body>
</html>
