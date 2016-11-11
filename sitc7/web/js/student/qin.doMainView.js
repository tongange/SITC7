var basePath = "/sitc/";

//region doLogin
function doLogin() {
    var studentName = $('#studentName').val();
    var studentEmail = $('#studentEmail').val();
    var h5_stuId = $('#h5_stuId').val();

    //region checkUI
    if (studentName.length == 0) {
        alert("Please enter a studentName! Thanks!");
        return ;
    }
    if (studentEmail.length == 0) {
        alert("Please enter a studentEmail! Thanks!");
        return ;
    }
    if (h5_stuId.length == 0) {
        alert("Please enter a studentId! Thanks!");
        return ;
    }
    //endregion

    //region doAjax
    var loginURL = basePath + "stdDetail/loginStudent.com?studentName="+studentName+
        "       &&studentEmail="+studentEmail+
        "       &&h5_stuId="+h5_stuId;

    console.log(loginURL);

    $.ajax
    (
        {
            url:loginURL,
            method:'POST',
            success:function(msg) {
                if (msg.substring(0, 7) == "success") {
                    studentName = msg.substring(7, msg.length);
                    console.log(studentName);

                    var url2 = basePath + "stdDetail/showStudent.com?studentName=" + studentName;
                    window.location.href = url2;
                }
            }
        }
    );
    //endregion
}
//endregion





















