import com.ddd.attendance.check.DDDApplication
import com.ddd.attendance.check.di.module.ActivityBindingModule
import com.ddd.attendance.check.di.module.NetworkModule
import com.ddd.attendance.check.di.module.ViewModelModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [AndroidSupportInjectionModule::class, NetworkModule::class, ViewModelModule::class, ActivityBindingModule::class]
)
interface DDDComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(app: DDDApplication): Builder

        fun build(): DDDComponent
    }

    fun inject(application: DDDApplication)

}