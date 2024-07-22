// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Pulumiverse.Aquasec
{
    public static class GetUsersSaas
    {
        /// <summary>
        /// The data source `aquasec.getUsersSaas` provides a method to query all saas users within the Aqua users management. The fields returned from this query are detailed in the Schema section below.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aquasec = Pulumi.Aquasec;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var users = Aquasec.GetUsers.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstUserEmail"] = data.Aquasec_users_saas.Users.Users[0].Email,
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetUsersSaasResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetUsersSaasResult>("aquasec:index/getUsersSaas:getUsersSaas", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// The data source `aquasec.getUsersSaas` provides a method to query all saas users within the Aqua users management. The fields returned from this query are detailed in the Schema section below.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aquasec = Pulumi.Aquasec;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var users = Aquasec.GetUsers.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstUserEmail"] = data.Aquasec_users_saas.Users.Users[0].Email,
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetUsersSaasResult> Invoke(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetUsersSaasResult>("aquasec:index/getUsersSaas:getUsersSaas", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetUsersSaasResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetUsersSaasUserResult> Users;

        [OutputConstructor]
        private GetUsersSaasResult(
            string id,

            ImmutableArray<Outputs.GetUsersSaasUserResult> users)
        {
            Id = id;
            Users = users;
        }
    }
}
