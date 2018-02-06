import org.kotlinacademy.backend.repositories.network.dto.NotificationResult
import org.kotlinacademy.data.Feedback
import org.kotlinacademy.data.FirebaseTokenData
import org.kotlinacademy.data.FirebaseTokenType
import org.kotlinacademy.data.News
import org.kotlinacademy.parseDate

val someFeedback = Feedback(1, 10, "Some comment", "Some suggestions")
val someNotificationResult = NotificationResult(222, 12)
val someNotificationResult2 = NotificationResult(21, 333)
val someEmail = "some@email.com"
val newNews = News(null, "News title", "News subtitle", "Image url", "Url", "2018-10-12T12:00:01".parseDate())
val someNews = News(1, "News title", "News subtitle", "Image url", "Url", "2018-10-12T12:00:01".parseDate())
val someNews2 = News(2, "News title 2", "News subtitle 2", "Image url 2", "Url 2", "2018-10-12T12:00:02".parseDate())
val someFirebaseTokenData = FirebaseTokenData("AAAA", FirebaseTokenType.Web)
val someFirebaseTokenData2 = FirebaseTokenData("BBB", FirebaseTokenType.Android)